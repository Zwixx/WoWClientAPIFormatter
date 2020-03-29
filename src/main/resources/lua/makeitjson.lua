json = require "json"

function dofile (filename)
	local f = assert(loadfile(filename))
	return f()
end

APIDocumentation = {};
APIDocumentation.data = {};
function APIDocumentation:AddDocumentationTable(Map);
	table.insert(self.data, Map);
end

function file_exists(file)
  local f = io.open(file, "rb")
  if f then f:close() end
  return f ~= nil
end

function lines_from(file)
	lines = {}
	for line in io.lines(file) do 
		lines[#lines + 1] = line
	end
	return lines
end

-- tests the functions above
local dir = 'F:/Development/workspace/wow-ui-source/AddOns/Blizzard_APIDocumentation/';
local file = dir..'Blizzard_APIDocumentation.toc'
local lines = lines_from(file)

-- print all line numbers and their contents
local inline = false;
for k,v in pairs(lines) do
	if (v == "# End documentation files here") then
		inline = false;
	end
	if (inline) then
		local filename = dir..v;
		if file_exists(filename) then
			dofile(filename)
		end
	end
	if (v == "# Start documentation files here") then
		inline = true;
	end
end

-- Opens a file in append mode
file = io.open("api.json", "w")

-- sets the default output file as test.lua
io.output(file)

-- appends a word test to the last line of the file
io.write(json.encode(APIDocumentation.data))

-- closes the open file
io.close(file)